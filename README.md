# swagger-issue1886

Swagger Issue #1886

Upgrading **swagger-jersey-jaxrs** to **1.5.7** break swagger.json :

```json
{"swagger":"2.0","info":{"version":"Swagger Server","title":""},"tags":[{"name":"foo"},{"name":"bar"}],"paths":{"/foo/bar":{"get":{"tags":["foo","bar"],"summary":"Foo","description":"Bar","operationId":"getQuestionMoyenneScore","produces":["application/json"],"parameters":[],"responses":{"200":{"description":"successful operation","schema":{"type":"number"}}}}}}}
```

Before (*1.5.5*) :

```json
{"swagger":"2.0","info":{"version":"1.0.0","title":"rest API Documentation"},"basePath":"/swagger-issue-1886-1.0-SNAPSHOT","tags":[{"name":"foo"},{"name":"bar"}],"schemes":["http","https"],"paths":{"/foo/bar":{"get":{"tags":["foo","bar"],"summary":"Foo","description":"Bar","operationId":"getQuestionMoyenneScore","produces":["application/json"],"parameters":[],"responses":{"200":{"description":"successful operation","schema":{"type":"number"}}}}}}}
```

Jersey version : 1.11
see https://glassfish.java.net/downloads/3.1.2.2-final.html
