class Lottery{
    // store players
   players= new Map();
   //O(1) constant time
   addPlayer(player){
       player.position= this.players.size-1;
    this.players.set(player.position,player.name);
   }

   //0(1) constant time to remove player from our map by position
   removePlayer(position){
    this.players.delete(position);
   }
   
   //0(1) to generate winner
   generateWinner(){
       let randPos=Math.floor(Math.random()*this.players.size-1);
       return this.players.get(randPos);
   }
}

let powerball= new Lottery();
powerball.addPlayer({name: "Roy"});
powerball.addPlayer({name:"Chris"});
powerball.addPlayer({name: "Donny"});
powerball.addPlayer({name: "Justin"});
powerball.addPlayer({name:"Stanley"});
console.log(powerball.generateWinner());