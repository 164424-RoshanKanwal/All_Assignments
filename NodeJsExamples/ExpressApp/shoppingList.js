var express = require("express");
var app = express();
var item = [{name: "pen", price: 23}, {name:"paper", price:10}, {name:"mobile", price:10000}];

app.get("/items", function(req, res){
    res.send(item);
});

app.post("/items", function(req, res){
    var itemName = req.query.name;
    var itemPrice = req.query.price;
    item[item.size]= {name: itemName, price: itemPrice};
    item.push({name: itemName, price: itemPrice});
    res.send(item);
})

app.get("/items/:id", function(req, res){
    res.send(item[req.params.id]);
})

app.patch("/item/:id", function(req, res){
    
})

app.delete("/items/:id", function(req, res){
    var itemToRemove = req.params.id;
    
})
app.listen(3333);
