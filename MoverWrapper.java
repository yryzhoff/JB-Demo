class MoverWrapper {
  private static final Logger LOGGER = Logger.getInstance(MoverWrapper.class);
  
  protected final boolean myIsDown;
  private final StatementUpDownMover myMover;
  private final StatementUpDownMover.MoveInfo myInfo;

  protected MoverWrapper(@NotNull final StatementUpDownMover mover, @NotNull final StatementUpDownMover.MoveInfo info, final boolean isDown) {
    myMover = mover;
    myIsDown = isDown;

    myInfo = info;
  }

  public StatementUpDownMover.MoveInfo getInfo() {
    return myInfo;
  }

  public final void move(final Editor editor, final PsiFile file) {
    assert myInfo.toMove2 != null;
    myMover.beforeMove(editor, myInfo, myIsDown);
    final Document document = editor.getDocument();

 if (new TextRange(start, end).intersectsStrict(new TextRange(start2, end2))) {
    TextRange range = new TextRange(start, end);
    TextRange range2 = new TextRange(start2, end2);
    
1111111111sdfsdfsdf
2343
werwtertrt
  43545
  wertwerterter
1111111111111111
  
 
