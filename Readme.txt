

POST  --------------> /auth/login
{
    "nombreUsuario":"denise",
    "password":"yoprogramo"
}

OK
eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJkZW5pc2UiLCJpYXQiOjE2ODE4MzY1NzgsImV4cCI6MTY4MTkyMjk3OH0.YR6l0eqvKa37RRu6AXLn3miMIb5BLmHYgcq06L2HGrptH1P9baL2qr6RHHMUv397b5k7teVfM4FLY-Oqu_8Suw

NOK
{
    "timestamp": "2023-04-18T18:09:09.703+00:00",
    "status": 401,
    "error": "Unauthorized",
    "path": "/auth/login"
}


----------------------------------------------------------------------------------------------------
POST ----- > /persona/nuevo
AUTHORIZATION - TYPE - SELECCIONA BEARER TOKEN
token
eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJkZW5pc2UiLCJpYXQiOjE2ODE4NDMzMTMsImV4cCI6MTY4MTkyOTcxM30.Z7BtrWSNpyAuaS1kE4KC_ZGMjT7IgBM-PzRZhUwWJ2-0z5IrqohjdbfP7LSGnxNrtCmjbOAB46nfbLuB7GX8Yw
BODY - RAW - JSON
 {
     "correo":"denisagustina@hotmail.com",
     "celular":"+54 291 456 7890",
      "ciudad":"Bahia Blanca, Bs.As, Argentina",
      "nacimiento":"2001",
      "ocupacion":"Estudiante Univertitario",
      "disponibilidad":"Disponible",
      "habilidades":"Conceptos y herramientas que utilizare : BackEnd, FrondEnd, DevOps, Testing, Seguridad Web ( JWT ), comunicacion efectiva, Api Rest, Scrum, Mvc, Contro de versiones Git, GitHub, Uml, Firebase, Heroku, Heroku Add On, entre otras."
 }
OK  - 200 ok
NOK - sin token
{
    "timestamp": "2023-04-18T18:12:37.487+00:00",
    "status": 401,
    "error": "Unauthorized",
    "path": "/persona/nuevo"
}


