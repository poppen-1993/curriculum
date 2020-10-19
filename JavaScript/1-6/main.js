//問1
let score = [10, 15, 20, 25];
console.log(score);

for ( let i = 0; i < score.length; i++ ) {
    if ( score[i] % 2 === 0 ) {
        console.log(`${score[i]}は偶数です。`);
    } else {

    }
}

//問2
const car = {
    gass : 20.5,
    num : 1234
}

console.log(`ガソリンは${car.gass}です`);
console.log(`ナンバーは${car.num}です`);
