
import sys

def main():
    data = sys.stdin.read().split()
    index = 0
    n = int(data[index]); index += 1
    k = int(data[index]); index += 1
    arr = [0] * n
    for i in range(n):
        arr[i] = int(data[index]); index += 1
    
    res = []
    o = 0
    e = 0
    for num in arr:
        if num == 1:
            o += 1
        else:
            e += 1
            
    for i in range(k):
        l = int(data[index]); index += 1
        r = int(data[index]); index += 1
        segment_length = r - l + 1
        if segment_length % 2 == 1:
            res.append("0")
        else:
            half_length = segment_length // 2
            if half_length <= o and half_length <= e:
                res.append("1")
            else:
                res.append("0")
                
    print("\n".join(res))

if __name__ == "__main__":
    main()

