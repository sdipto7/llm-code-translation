
import sys
from collections import defaultdict

def main():
    data = sys.stdin.read().split()
    n = int(data[0])
    m = int(data[1])
    
    map_dict = {}
    count_ac = 0
    count_wa_all = 0
    
    index = 2
    for i in range(m):
        question = int(data[index])
        wa_or_ac = data[index + 1]
        index += 2
        
        if question not in map_dict:
            if wa_or_ac == "WA":
                map_dict[question] = 1
            else:
                map_dict[question] = -1
                count_ac += 1
        else:
            count_wa = map_dict[question]
            if count_wa < 0:
                continue
            else:
                if wa_or_ac == "WA":
                    map_dict[question] = count_wa + 1
                else:
                    map_dict[question] = -count_wa
                    count_ac += 1
                    count_wa_all += count_wa
    
    print(f"{count_ac} {count_wa_all}")

if __name__ == "__main__":
    main()

