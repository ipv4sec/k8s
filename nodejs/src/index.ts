import * as express from "express";

let application: express.Application = express();


application.get('/', function (req, res) {
  res.json({
    "name": "nodejs"
  })
});
application.listen(8080);