<h1>A comprehensive Auth Service module for your Springboot microservices</h1>
<hr>
<h3>Key features</h3>
<ul>
  <li>Register new users</li>
  <li>Login users</li>
  <li>Bearer token authentication</li>
  <li>Sign in with google feature</li>
  <li>Email verification</li>
  <li>Forgot password</li>
</ul>

<hr>

<h3>Technologies used</h3>
<ul>
  <li>Java: version-17</li>
  <li>Springboot: version-3</li>
  <li>Spring Security: version-6</li>
  <li>Oauth 2</li>
</ul>

<hr>

<h3>Steps to run the application:</h3>
<ol>
  <h4>In application.yml file</h4>
  <li>Create two properties namely, "clientId" and "clientSecret" to feed your google oauth client credentials</li>
  <li>The application uses h2 inmemory database, you can configure your own database(mysql or posgresql)</li>
  <li>Modify the smtp username and password fields to your smtp server credentials(like gmail)</li>
  <h4>In index.html file(this step will be simplified in the upcoming release)</h4>
  <li>Modify the clientId parameter to your google client id in line no.34</li>
</ol>
<br>
Now your spring boot application is ready to run!!!







