var app = new Vue({
    el: '#app',
    data: {
        list: [],
        addText: '',
        sreachText: '',
    },
    watch: {
        list: {
            handler: function() {
                localStorage.setItem("list", JSON.stringify(this.list));
            },
            deep: true
        }
    },

    mounted: function() {
        this.list = JSON.parse(localStorage.getItem("list")) || [];
    },
    computed: {
		remainingTask: function() {
            const count = this.list.reduce((count, todo) => 
                count = (todo.isChecked) ? count : ++count 
                , 0);
            // 配列.reduce(コールバック, 初期値)
            // function(count, todo) {
            // 条件式 ? 式1(true) : 式2(false) }
            return count;
		},
        filterText: function() {
            return this.filter(this.list, this.sreachText);
        }
	},
    methods: {
        addToDo: function() {
            if (this.addText !== '') {
                this.list.push({
                    text: this.addText,
                    isChecked: false,
                });               
            }
            this.addText = '';
            console.log(this.list.length)
        },
        deleteBtn: function() {
            this.list = this.list.filter(function(todo) {
                console.log("削除を実行");
                return !todo.isChecked;
            });
        },
        filter: function(sentence, word){
            return sentence.filter(function(list) {
                return list.text.indexOf(word) !== -1 || word === "";
            });
        }        
    }
});

let user = {
    name: "太郎",
    age: "20",
    email: "sample.com"
}

// localStorage.setItem("user", user);
// localStorage.getItem("user");

localStorage.setItem("user", JSON.stringify(user));
JSON.parse(localStorage.getItem("user"));