# How to access the method of nested class from main
The easiest thing to do is to create the instance of all the outer class.

For e.g :-<br>
t2>t4>t3<br>
then we can access the method of t3 in main() which is inside the class t2 by:<br><br>
t2 obj = new t2();<br>
t2.t4 obj1 = obj.new t4();<br>
t2.t4.t3 obj2 = obj1.new t3();<br><br>
then calling the method from instance "obj2"
