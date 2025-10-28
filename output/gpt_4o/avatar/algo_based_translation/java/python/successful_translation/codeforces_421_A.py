
import sys

def main():
    input = sys.stdin.read
    data = input().split()
    index = 0
    
    n = int(data[index])
    index += 1
    a = int(data[index])
    index += 1
    b = int(data[index])
    index += 1
    
    list1 = []
    list2 = []
    
    for i in range(a):
        list1.append(int(data[index]))
        index += 1
    
    for i in range(b):
        list2.append(int(data[index]))
        index += 1

    result = []
    for i in range(1, n + 1):
        if i in list1:
            result.append("1")
        else:
            result.append("2")
    
    print(" ".join(result))

if __name__ == "__main__":
    main()

