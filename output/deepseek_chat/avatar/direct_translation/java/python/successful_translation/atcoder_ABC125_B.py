
def main():
    import sys
    n = int(sys.stdin.readline())
    v_str = sys.stdin.readline()
    v_list = str2list(v_str)
    c_str = sys.stdin.readline()
    c_list = str2list(c_str)
    max_profit = 0
    for i in range(n):
        profit = v_list[i] - c_list[i]
        if profit > 0:
            max_profit += profit
    print(max_profit)

def str2list(s):
    arr = s.split()
    return {i: int(arr[i]) for i in range(len(arr))}

if __name__ == "__main__":
    main()

