import sys

def main():
    n = int(sys.stdin.readline())
    str_list = [sys.stdin.readline().strip() for _ in range(n)]
    marks = ["S", "H", "C", "D"]
    for mark in marks:
        for i in range(1, 14):
            s = f"{mark} {i}"
            if s in str_list:
                continue
            else:
                print(s)

if __name__ == "__main__":
    main()
