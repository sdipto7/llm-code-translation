
def str2list(s):
    v_arr_str = s.split(" ")
    ret = {}
    key = 0
    for val in v_arr_str:
        ret[key] = int(val)
        key += 1
    return ret

def main():
    import sys
    input = sys.stdin.read
    data = input().splitlines()
    
    n = int(data[0])
    v_str = data[1]
    c_str = data[2]
    
    v_list = str2list(v_str)
    c_list = str2list(c_str)
    
    max_profit = 0
    for i in range(n):
        profit = v_list[i] - c_list[i]
        if profit > 0:
            max_profit += profit
    
    print(max_profit)

if __name__ == "__main__":
    main()

