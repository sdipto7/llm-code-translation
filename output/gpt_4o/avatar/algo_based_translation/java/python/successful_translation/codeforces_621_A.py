
import sys

def main():
    input = sys.stdin.read
    data = input().split()
    
    n = int(data[0])
    list_values = list(map(int, data[1:n+1]))
    
    odd = []
    sum_value = 0
    
    for i in list_values:
        if i % 2 == 0:
            sum_value += i
        else:
            odd.append(i)
    
    odd.sort()
    
    for i in odd:
        sum_value += i
    
    if len(odd) % 2 != 0:
        sum_value -= odd[0]
    
    print(sum_value)

if __name__ == "__main__":
    main()

