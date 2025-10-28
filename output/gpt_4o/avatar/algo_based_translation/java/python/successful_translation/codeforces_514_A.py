
import math

def main():
    x = int(input().strip())
    list_ = []
    
    while x > 0:
        r = x % 10
        if 9 - r < r:
            if x // 10 == 0 and 9 - r == 0:
                list_.append(r)
            else:
                list_.append(9 - r)
        else:
            list_.append(r)
        x = x // 10
    
    pow_ = 0
    new_number = 0
    for i in range(len(list_)):
        new_number += list_[i] * int(math.pow(10, pow_))
        pow_ += 1
    
    print(new_number)

if __name__ == "__main__":
    main()

