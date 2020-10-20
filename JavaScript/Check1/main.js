//問1
let number = [2, 5, 12, 13, 15, 18, 22];
//以下、答え

for (let i = 0; i < number.length; i++ ) {
    if ( number[i] % 2 === 0 ) {
        num = number[i];

        inEven(num);
    }
} 

function inEven(num) {
    console.log( num + `は偶数です`);
}

//問2
class car {

    constructor(gass, car_number) {
        this.gass = gass;
        this.car_number = car_number;
    }

    getNumGas() {
        console.log(`ガソリンは${this.gass}です。ナンバーは${this.car_number}です`);
    }
}

let car_status = new car ( `〇〇`, `△△`);
car_status.getNumGas();