
import sys

E = int(input())
Y = int(input())

if E == 0:
    if Y <= 1911:
        print("M" + str(Y - 1867))
    elif Y <= 1925:
        print("T" + str(Y - 1911))
    elif Y <= 1988:
        print("S" + str(Y - 1925))
    else:
        print("H" + str(Y - 1988))
elif E == 1:
    print(1867 + Y)
elif E == 2:
    print(1911 + Y)
elif E == 3:
    print(1925 + Y)
else:
    print(1988 + Y)

