let fs = require("fs");
let path= require("path");

function parseRequestBytes(request){
    let results=request.split(' ');
    let len= results.length;
    return Number.parseInt(results[len-1]);
}

function parseRequests(filename){
  
    try{
        let data= fs.readFileSync(path.join("JS","challenges",filename));
        let requests = data.toString().split('\n');
        
        let numReq=0;
        let sum=0;
        let reqBytes=0;
        for(let req of requests){
            reqBytes= parseRequestBytes(req);
            if(reqBytes> 5000){
                numReq++;
                sum+= reqBytes;
            }
        }
        let outputdata= `${numReq}\n${sum}`;
        fs.writeFileSync(path.join("JS","challenges","bytes_"+filename),outputdata);
    }
    catch(err){
        console.log(err);
    }

    //console.log(inputFile.toString());
}

parseRequests("example");