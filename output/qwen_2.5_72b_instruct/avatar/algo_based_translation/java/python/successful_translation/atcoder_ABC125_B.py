
import sys

def str2List(s):
    vArrStr = s.split()
    ret = {}
    key = 0
    for val in vArrStr:
        ret[key] = int(val)
        key += 1
    return ret

def main():
    import sys
    input = sys.stdin.read().splitlines()
    n = int(input[0])
    vStr = input[1]
    vList = str2List(vStr)
    cStr = input[2]
    cList = str2List(cStr)
    max_profit = 0
    for i in range(n):
        profit = vList[i] - cList[i]
        if profit > 0:
            max_profit += profit
    print(max_profit)

if __name__ == "__main__":
    main()

