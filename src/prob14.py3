with open("prob14.txt") as prob14_file:
    dataset = prob14_file.readlines()

for data in dataset[1:]:
    #TODO write code
    one = []
    two = []
    data_split = [element.strip() for element in data.split(" ")]
    # print(data_split)

    one = data_split[1:int(data_split[0])*2+1]
    two = data_split[int(data_split[0])*2+2:]
    formatted_one = []
    formatted_two = []
    for i in range(int(len(one)/2)):
        formatted_one.append([int(one[i*2]), one[i*2+1]])

    for i in range(int(len(two)/2)):
        formatted_two.append([int(two[i*2]), two[i*2+1]])
    
    prev = 0
    for element in formatted_one:
        element[0] += prev
        prev = element[0]
    
    prev = 0
    for element in formatted_two:
        element[0] += prev
        prev = element[0]

    formatted_one = sorted(formatted_one, key=lambda x:x[1])
    formatted_two = sorted(formatted_two, key=lambda x:x[1])

    start = formatted_one[0][0]
    for measure in formatted_one:
        measure[0] = (measure[0]-start) % 360
    start = formatted_two[0][0]
    for measure in formatted_two:
        measure[0] = (measure[0]-start) % 360
    if len(formatted_one) < len(formatted_two):
        for element in formatted_one:
            subset = False
            for element_two in formatted_two:
                if element == element_two:
                    subset = True
        if subset:
            print("PARTIAL")
        else:
            print("MISMATCH")
    elif len(formatted_one) > len(formatted_two):
        for element in formatted_two:
            subset = False
            total = True
            for element_two in formatted_one:
                if element == element_two:
                    subset = True
        if subset:
            print("PARTIAL")
        else:
            print("MISMATCH")
    elif formatted_one == formatted_two:
        print("EXACT")