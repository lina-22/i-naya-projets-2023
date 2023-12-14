const express = require("express");
const app = express();
const PORT = process.env.PORT || 4002;
const server = app.listen(PORT, () => console.log(`server on port ${PORT}`));

app.use(express.static(path.join(__dirname, "public")));
