
import sys

n = int(sys.stdin.readline().strip())
str_list = [sys.stdin.readline().strip() for _ in range(n)]
mark = ["S", "H", "C", "D"]
for ma in mark:
    for i in range(1, 14):
        st = ma + " " + str(i)
        if st not in str_list:
            print(st)

