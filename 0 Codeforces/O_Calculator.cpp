#include<iostream>
using namespace std;

int main() {
    // Input A, operator S, and B
    int A, B, result;
    char operatorS;
    cin >> A >> operatorS >> B;

    // Calculate the result based on the operator
    if (operatorS == '+') {
        result = A + B;
    } else if (operatorS == '-') {
        result = A - B;
    } else if (operatorS == '*') {
        result = A * B;
    } else if (operatorS == '/') {
        result = A / B;
    }

    // Print the result
    cout << result << endl;

    return 0;
}
