
import sys

def main():
    import sys
    from typing import List

    sc = sys.stdin
    n = int(sc.readline().strip())
    list_ = []
    for _ in range(n):
        list_.append(int(sc.readline().strip()))
    odd = []
    sum_ = 0
    for i in list_:
        if i % 2 == 0:
            sum_ += i
        else:
            odd.append(i)
    odd.sort()
    for i in odd:
        sum_ += i
    if len(odd) % 2 != 0:
        sum_ -= odd[0]
    print(sum_)

if __name__ == "__main__":
    main()

