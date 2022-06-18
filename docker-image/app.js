const express = require('express');
const app = express();
const path = require('path')

app.use(express.json());

app.get('/name', (req, res) => {
    res.send(JSON.stringify({
        name: "Raj Manandhar",
        email: "raj.mdhr@gmail.com"
    }))
})

app.listen(8080, ()=> console.log('server listening..'))