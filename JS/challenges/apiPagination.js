const axios = require("axios");
const https =require("https");

async function totalUsersWithAxios() {
  let currPage = 1;
  let totalPages = 50;
  let total = 0;
  while (currPage <= totalPages) {
    let response = await axios.get(
      `https://randomuser.me/api/?page=${currPage}`
    );

    let { results } = response.data;
    total += results.length;
    currPage++;
  }
  return total;
}
function httpsPromiseWrapper(url){
    return new Promise((resolve,reject)=>{
        https.get(url,(res)=>{
                let data=[];
                res.on("data",(d)=>{
                  data+=d;
                });
      
                res.on("end",()=>{
                    data= JSON.parse(data);
                    resolve(data.results);
                });
                res.on("error",(err)=>{
                    reject(err);
                });
            }
          );
    })
}
async function totalUsersWithHttps() {
    let currPage = 1;
    let totalPages = 5;
    let total = 0;
    while (currPage <= totalPages) {
      let results = await httpsPromiseWrapper(`https://randomuser.me/api/?page=${currPage}`);
      total+=results.length;
      currPage++;
    }
    return total;
  }

//Easy solution for api pagination using Axios library
totalUsersWithAxios().then((total) => console.log(total)).catch((err) => console.log(err));

//Solution for api pagination using internal https library
//requires us to wrap it in a promise in order await its result
totalUsersWithHttps(total=> console.log(total)).catch((err) => console.log(err));
