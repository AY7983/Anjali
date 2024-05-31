let boxes = document.querySelectorAll(".box");
let boxArr = Array.from(boxes);
let resetBtn = document.querySelector("#reset-btn");
let newGameBtn = document.querySelector("#new-btn");
let msgContainer = document.querySelector(".msg-container");
let msg = document.querySelector("#msg");
let btn = document.querySelector(".btn");
let colorchange = document.querySelector(".colorch");


let turnO = true; //playerX , playerO
let count = 0;    //To Track Draw


//2D Array
const winPatterns = [
    [0,1,2],
    [0,3,6],
    [0,4,8],
    [1,4,7],
    [2,5,8],
    [2,4,6],
    [3,4,5],
    [6,7,8]
];

//for reset the game and start again as a new game.
const resetGame = () => {
    turnO = true;
    count = 0;
    enableBoxes();
    msgContainer.classList.add("hide");     //firse msgContainer ko hide kr denge kon winner tha y ht jayga or new game start ho jayga.
}

boxArr.forEach(box=> {
    box.addEventListener("click",()=>{
        if(turnO ===  true){
            //playerO
            box.innerText = "O";
            if(box.innerText = " O"){
            btn.classList.add("btn");
            colorchange.classList.remove("colorch");
            }
            turnO = false;
            
        }
        else{
            box.innerText = "X";
            if(box.innerText = "X"){            
            btn.classList.remove("btn");
            colorchange.classList.add("colorch");
        }
            turnO = true; 

        }
        box.disabled = true;
        count++;
        
      let isWinner = checkWinner(); 

      if(count == 9 && !isWinner){
        gameDraw();
      }
    });
});

 
const gameDraw = () => {
    msg.innerText = `Game was a Draw.`;
    msgContainer.classList.remove("hide");
    disableBoxes();
};

//  after one-winner , game is complete.
const disableBoxes = () =>{
    for(let box of boxes){
        box.disabled = true;
    }
};

// for starting new game after winner.
const enableBoxes = () =>{
    for(let box of boxes){
        box.disabled = false;
        box.innerText = "";        //firse game shuru krne k liye sara text ht jaye X and O.
    }
};

const showWinner = (winner) => {
    msg.innerText = `Congratulations🎊, Winner is ${winner}`;
    msgContainer.classList.remove("hide");
    disableBoxes();
};

const checkWinner = () =>{
    for(let pattern of winPatterns){
            let pos1Val = boxes[pattern[0]].innerText;
            let pos2Val = boxes[pattern[1]].innerText;
            let pos3Val = boxes[pattern[2]].innerText;
        
        if(pos1Val != "" && pos2Val != "" && pos3Val !=""){
            if(pos1Val === pos2Val && pos2Val === pos3Val){
                console.log("winner",pos2Val);
                showWinner(pos1Val);
                return true;
            }
        }
    }

};

newGameBtn.addEventListener("click",resetGame);  //y trigger krega reset function ko jb bhi new btn p click krenge;
resetBtn.addEventListener("click",resetGame);    //y trigger krega reset function ko jb bhi reset btn p click krenge;

