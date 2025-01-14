#include <iostream>
#include <string>
using namespace std;

int main( int argc, char ** argv ) {
	string s1 = "This is a string";
	string::iterator it;

	// size & length
	cout << "size is same as length: " << s1.length() << endl;

	// + for concatenation
	cout << "concatenated strings: ";
	string s2 = "this is also a string";
	cout << s1 + ":" + s2 << endl;

	// compare
	cout << "is s1 == s2? " << (s1 == s2 ? "yes" : "no") << endl;
	cout << "copy-assign s2 = s1" << endl;
	s2 = s1;
	cout << "is s1 == s2? " << (s1 == s2 ? "yes" : "no") << endl;

	// iteration
	cout << "each character: ";
	for(it = s1.begin(); it != s1.end(); it++) {
		cout << *it << " ";
	}
	cout << endl;

	// insert & erase with an iterator
	it = s1.begin() + 5;
	s1.insert(it, 'X');
	cout << "after insert: " << s1 << endl;

	it = s1.begin() + 5;
	s1.erase(it);
	cout << "after erase: " << s1 << endl;

	// replace
	s1.replace(5, 2, "ain't");
	cout << "after replace: " << s1 << endl;

	// substr
	cout << "substr: " << s1.substr(5, 5) << endl;

	// find
	size_t pos = s1.find("s");
	cout << "find first \"s\" in s1 (pos): " << pos << endl;
	cout << "substr at pos: " << s1.substr(pos) << endl;

	// rfind
	pos = s1.rfind("s");
	cout << "find last \"s\" in s1 (pos): " << pos << endl;
	cout << "substr at pos: " << s1.substr(pos) << endl;

	return 0;
}
