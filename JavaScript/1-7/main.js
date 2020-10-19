class Taiyaki {
    constructor ( nakami ) {
        this.nakami = nakami;
    }

    Tai () {
        console.log(`中身は${this.nakami}です`)
    }
}

let anko = new Taiyaki('あんこ');
let cream = new Taiyaki(`クリーム`);
let cheeze = new Taiyaki(`チーズ`);

anko.Tai();
cream.Tai();
cheeze.Tai();