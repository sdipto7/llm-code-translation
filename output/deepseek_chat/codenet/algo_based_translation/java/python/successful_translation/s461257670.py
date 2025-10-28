
import sys

def main():
    data = sys.stdin.read().split()
    count = int(data[0])
    index = 1
    for i in range(count):
        y = int(data[index])
        m = int(data[index+1])
        d = int(data[index+2])
        index += 3
        print(Answer(y, m, d))

def Answer(y, m, d):
    result = 1
    
    if y % 3 == 0:
        result += 20 - d
    elif m % 2 == 0:
        result += 19 - d
    else:
        result += 20 - d
    
    current_m = m + 1
    while current_m <= 10:
        if y % 3 == 0:
            result += 20
        else:
            if current_m % 2 == 0:
                result += 19
            else:
                result += 20
        current_m += 1
    
    current_y = y + 1
    while current_y < 1000:
        if current_y % 3 == 0:
            result += 200
        else:
            result += 195
        current_y += 1
    
    return result

if __name__ == "__main__":
    main()

