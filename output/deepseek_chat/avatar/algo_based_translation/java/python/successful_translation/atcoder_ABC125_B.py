
import sys

def main():
    n = int(input().strip())
    v_str = input().strip()
    v_list = str2list(v_str)
    c_str = input().strip()
    c_list = str2list(c_str)
    max_val = 0
    for i in range(n):
        profit = v_list[i] - c_list[i]
        if profit > 0:
            max_val += profit
    print(max_val)

def str2list(input_str):
    arr = input_str.split()
    ret = {}
    key = 0
    for val in arr:
        ret[key] = int(val)
        key += 1
    return ret

if __name__ == "__main__":
    main()

