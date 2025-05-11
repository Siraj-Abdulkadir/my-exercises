#include <iostream>
using namespace std;

int main(){
  int x,y;
  int operatorChoosen;
  double Sum;
  double Subration;
  double Multiplication;
  double Division;

  cout << "Enter your First Number: ";
  cin >> x;

  cout << "Enter the Second Number: ";
  cin >> y;

  cout << "Enter 1 for Addition \n";
  cout << "Enter 2 for Subtration \n";
  cout << "Enter 3 for Multiplication \n";
  cout << "Enter 4 for Division \n";
  cin >> operatorChoosen;

  if(operatorChoosen == 1){
    Sum = x + y;
    cout << "Their Sum is: " << Sum;    
  }

  else if (operatorChoosen == 2)
  {
    Subration = x - y;
    cout << "Their Difference is: " << Subration;
  }

  else if (operatorChoosen == 3)
  {
    Multiplication = x*y;
    cout << "Their Product is: " << Multiplication;
  }
  
  else if (operatorChoosen == 4)
  {
    Division = x/y;
    cout << "Their Quotient is: " << Division;
  }

  else {
    cout << "Please Enter the correct number!!!" ;
  }
}