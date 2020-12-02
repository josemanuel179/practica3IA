jar: compile
	jar -cfm atp.jar Manifest.txt -C bin .

compile: clean
	mkdir -p bin
	find . -name *.java | xargs javac -cp bin -d bin

clean:
	rm -rf *.jar
	rm -rf bin/*

