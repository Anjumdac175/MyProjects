#include<iostream>
#include"Book.h"
#include<fstream>
using namespace std;

int main() 
{
    int choice, pos, id;

    while (true) {
        cout << "\n===== Book Management System =====\n";
        cout << "1. Add Book\n";
        cout << "2. Display All Books\n";
        cout << "3. Display Specific Book (Position Based)\n";
        cout << "4. Delete Book (By Book ID)\n";
        cout << "5. Exit\n";
        cout << "Enter choice: ";
        cin >> choice;

        switch (choice) {
            case 1:
		    {
			Book::AddBook();
                	break;
		    }
            case 2:
		    {
			Book::DisplayAll();
                	break;
		    }
            case 3:
		    {
                	cout << "Enter position (starting from 0): ";
                	cin >> pos;
			Book::Displayspec(pos);
                	break;
		    }
            case 4:
		    {
                	cout << "Enter Book ID to delete: ";
                	cin >> id;
			Book::DeleteBook(id);
                break;
		    }
            case 5:
                	cout << "Exiting program!\n";
                	return 0;
            default:
                cout << "Invalid choice! Try again.\n";
        }
    }

    return 0;
}
