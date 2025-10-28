
import sys

def main():
    input = sys.stdin.read
    data = input().split()
    
    index = 0
    
    n = int(data[index])
    index += 1
    k = int(data[index])
    index += 1
    
    arr = [0] * n
    for i in range(n):
        arr[i] = int(data[index])
        index += 1
    
    o = 0
    e = 0
    for i in range(n):
        if arr[i] == 1:
            o += 1
        else:
            e += 1
    
    res = []
    for i in range(k):
        l = int(data[index])
        index += 1
        r = int(data[index])
        index += 1
        
        segment_length = r - l + 1
        if segment_length % 2 == 1:
            res.append("0")
        else:
            if segment_length // 2 <= o and segment_length // 2 <= e:
                res.append("1")
            else:
                res.append("0")
    
    print("\n".join(res))

if __name__ == "__main__":
    main()

