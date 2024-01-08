const mongoose = require("mongoose");


const uri = `mongodb+srv://root:root@cluster0.mhxgmis.mongodb.net/?retryWrites=true&w=majority`;
mongoose
.connect(uri)
.then(() =>
    console.log("✅✅✅ Established a connection to the database ")
)
.catch((err) =>
    console.log(
    " ❌❌❌Something went wrong when connecting to the database",
    err
    )
);