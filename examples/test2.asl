func main()
	rSet(40.0,25.0,180.0);
	oSet(25.0,15.0,1.0,29.0);
	rMove(99.0);
	rTurn(-90.0);
	while rFeel(2) = true do
		rMove(0.001);
	endwhile;
	rTurn(90.0);
	rMove(99.0);
endfunc
