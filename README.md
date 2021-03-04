# limon-api-dev

Application works on port `8080` by default.

Once it is started it exposes two endpoints:

#### Greet
URL : `{HOST:PORT}/api/greet` GET

Param : `name` (optional)

Example : `localhost:8080/api/greet?name=Limon`

Output : `Hello Limon!`

#### Echo
This endpoint simply echoes incoming payload with one added attribute.

URL : `{HOST:PORT}/api/echo` POST

Payload (Body) : Any JSON (optional)

