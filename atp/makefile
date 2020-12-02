jar_file = aprendizaje.jar

jar: compile
	jar cvfm $(jar_file) Manifest.txt -C bin .
compile: clear
	mkdir -p bin
	cp test_data/modeloTest.arff test_data/test.arff
	find . -name *.java | xargs javac -cp "lib/*:bin" -d bin
clear:
	rm -rf html
	rm -rf bin/*
	rm -f $(jar_file)
	rm -rf test_data/test.arff
debug: compile_debug
	cd bin
	jdb -sourcepath ../src
compile_debug: clear
	mkdir -p bin
	find . -name *.java | xargs javac -g -cp bin -d bin
doc:
	rm -rf html
	mkdir html
	find . -name "*.java" | xargs javadoc -d html -encoding utf-8 -docencoding utf-8 -charset utf-8
