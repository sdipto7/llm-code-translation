
import re

def main():
    word1 = re.sub('[^a-zA-Z]', '', input()).lower()
    word2 = re.sub('[^a-zA-Z]', '', input()).lower()
    word3 = re.sub('[^a-zA-Z]', '', input()).lower()

    perms = [
        word1 + word2 + word3,
        word1 + word3 + word2,
        word2 + word1 + word3,
        word2 + word3 + word1,
        word3 + word2 + word1,
        word3 + word1 + word2
    ]

    students = int(input())
    for _ in range(students):
        test_case = re.sub('[^a-zA-Z]', '', input()).lower()
        if test_case in perms:
            print("ACC")
        else:
            print("WA")

if __name__ == "__main__":
    main()

