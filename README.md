## Dockerize a Spring Boot App with Jib


# Spring Boot, OAuth 2.0, and Okta Example

A Spring Boot example app that shows how to use Jib to package your application with Docker.

Please read [Get Jibby With Java, Docker, and Spring Boot](http://developer.okta.com/blog/2019/08/09/jib-docker-spring-boot) to see how this app was created.

**Prerequisites:** [Java 11](https://adoptopenjdk.net/).

> [Okta](https://developer.okta.com/) has Authentication and User Management APIs that reduce development time with instant-on, scalable user infrastructure. Okta's intuitive API and expert support make it easy for developers to authenticate, manage, and secure users + roles in any application.

* [Getting Started](#getting-started)
* [Links](#links)
* [Help](#help)
* [License](#license)

## Getting Started

To install this example application, run the following commands:

```bash
git clone https://github.com/oktadeveloper/okta-spring-boot-docker-example.git
cd okta-spring-boot-docker-example
```

This will get a copy of the project installed locally. To run the example, run the following command:
 
```bash
./gradlew bootRun
```

### Create an OIDC App in Okta

You will need to [create an OIDC App in Okta](https://developer.okta.com/blog/2017/03/21/spring-boot-oauth#create-an-openid-connect-app-in-okta) to get a `clientId` and `clientSecret`. 

Log in to your Okta Developer account (or [sign up](https://developer.okta.com/signup/) if you don’t have an account) and navigate to **Applications** > **Add Application**. Click **Web**, click **Next**, and give the app a name you’ll remember. Click **Done** and copy the `clientId` into `server/src/main/resources/application.yml`. 

```yaml
okta:  
  oauth2:  
    issuer: https://{yourOktaDomain}/oauth2/default  
    client-id: {yourClientID}
```

**NOTE:** The value of `{yourOktaDomain}` should be something like `dev-123456.okta.com`. Make sure you don't include `-admin` in the value!

After modifying this file, restart your app and it'll be protected by Okta! See this repo's [blog post](http://developer.okta.com/blog/2019/08/09/jib-docker-spring-boot) to learn how to gain access to it with an OAuth 2.0 access token.

## Links

This example uses the [Okta Spring Boot Starter](https://github.com/okta/okta-spring-boot) to integrate with Okta.

## Help

Please post any questions as comments on the [blog post](http://developer.okta.com/blog/2019/08/09/jib-docker-spring-boot), or visit our [Okta Developer Forums](https://devforum.okta.com/). 

## License

Apache 2.0, see [LICENSE](LICENSE).

