object GetSecret {

  import com.amazonaws.services.secretsmanager._
  import java.security.InvalidParameterException
  import java.util.Base64


  def getSecret(secretName : String, regionName : String): Unit = {

    val secretName = secretName
    val region = regionName

    // Create a Secrets Manager client
    val client = AWSSecretsManagerClientBuilder.standard.withRegion(region).build

    var secret = null
    var decodedBinarySecret = null
    val getSecretValueRequest = new GetSecretValueRequest().withSecretId(secretName)
    var getSecretValueResult = null

    try {
      getSecretValueResult = client.getSecretValue(getSecretValueRequest)
    }
    catch {
      case e: DecryptionFailureException =>
        println("DecryptionFailureException")
        throw e
      case e: InternalServiceErrorException =>
        println("InternalServiceErrorException")
        throw e
      case e: InvalidParameterException =>
        println("InternalServiceErrorException")
        throw e
      case e: InvalidRequestException =>
        println("InvalidRequestException")
        throw e
      case e: ResourceNotFoundException =>
        println("ResourceNotFoundException")
        throw e
    }

    if (getSecretValueResult.getSecretString != null) {
      secret = getSecretValueResult.getSecretString()
    } else {
      decodedBinarySecret = new String(Base64.getDecoder.decode(getSecretValueResult.getSecretBinary).array)
    }
  }
}

def check(func : Int => Boolean): Boolean = true
def find(p: (A) ⇒ Boolean): Option[A]

find(5 => 5>0)