const express = require('express');

const app = express();

function middle(req,res,next){
    if(req.params.name == "Chris")
        console.log(req.params.name);
    next();
}
app.get('/:name',middle,(req, res)=>{
    return res.send(req.params.name);
});
app.listen(8080, () =>console.log("server up at port 8080"));