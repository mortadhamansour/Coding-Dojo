console.log("page loaded...");
function change(e){
    var e = document.querySelector('#NameToChange');
    e.innerText = 'Todd'
}
function hide1(e){
    var e = document.querySelector('#user1');
    num2.innerHTML++
    num1.innerHTML--
    e.remove('#user1')
}
function hide2(element){
    var element = document.querySelector('#user2');
    num2.innerHTML++
    num1.innerHTML--
    element.remove('#user2')
}