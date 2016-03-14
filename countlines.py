#-*-encoding:utf-8-*-
import os

rootdir = "."
count = 0
for parent, dirnames, filenames in os.walk(rootdir):
	for filename in filenames:
		filename = parent+ '/' + filename
		if filename.split('.')[len(filename.split('.')) -1] == 'java':
			with open(filename,'r',encoding='utf8',errors='ignore') as file:
				for line in file.readlines():
					if '//' not in line and '/*' not in line and '*/' not in line\
					and line != chr(10) and line != '\n' and line != '':
						if len(line.strip()) > 0 and line.strip()[0] != '*':
							count += 1
print('代码行数',count,sep=":")