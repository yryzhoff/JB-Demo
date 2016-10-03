class MoverWrapper {
  private static final Logger LOGGER = Logger.getInstance(MoverWrapper.class);
  
  protected final boolean myIsDown;
  private final StatementUpDownMover myMover;
  private final StatementUpDownMover.MoveInfo myInfo;

  protected MoverWrapper(@NotNull final StatementUpDownMover mover, @NotNull final StatementUpDownMover.MoveInfo info, final boolean isDown) {
    myMover = mover;
    myIsDown = isDown;
dfgdfgdfgdfgd
    
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
    
    
fghfgghfh34534543534
//asdasd858669696
45657567686zvnbmcnbsdkjfskhweorhjdhjd
