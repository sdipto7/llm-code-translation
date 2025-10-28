
import sys

def main():
    S = input().strip()
    begin = ""
    end = ""
    answer = ""

    for i in range(len(S)):
        for j in range(len(S)):
            begin = S[0:i]
            end = S[j:]
            answer = begin + end

            if answer == "keyence":
                print("YES")
                return

            if begin == "keyence":
                print("YES")
                return

            if end == "keyence":
                print("YES")
                return

    print("NO")

if __name__ == "__main__":
    main()

