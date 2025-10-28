
mod = 1000000007

def main():
    import sys
    input = sys.stdin.read
    data = input().split()
    
    n = int(data[0])
    q = int(data[1])
    c = data[2]
    range_list = []
    index = 3
    for _ in range(q):
        l = int(data[index])
        r = int(data[index + 1])
        range_list.append((l, r))
        index += 2

    frag = [0] * (n + 1)
    rui = [0] * (n + 1)
    
    for i in range(2, n + 1):
        if c[i - 2] == 'A' and c[i - 1] == 'C':
            frag[i] += 1
        rui[i] = rui[i - 1] + frag[i]

    results = []
    for i in range(q):
        left, right = range_list[i]
        results.append(rui[right] - rui[left])
    
    for result in results:
        print(result)



