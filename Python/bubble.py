n = int(input().strip())
a = list(map(int, input().strip().split(' ')))
swap_count = 0
for idx, val in enumerate(a):
    for idx, val in enumerate(a):
        if(idx == n - 1):
            break
        elif (a[idx] > a[idx + 1]):
            a[idx], a[idx + 1] = a[idx + 1], a[idx]
            swap_count+=1
print("Array is sorted in " + str(swap_count) + " swaps.")
print("First Element: " + str(a[0]))
print("Last Element: " + str(a[n - 1]))
