// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: solana-storage.proto

package solana.storage.ConfirmedBlock;

public interface ConfirmedBlockOrBuilder extends
    // @@protoc_insertion_point(interface_extends:solana.storage.ConfirmedBlock.ConfirmedBlock)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string previous_blockhash = 1;</code>
   * @return The previousBlockhash.
   */
  String getPreviousBlockhash();
  /**
   * <code>string previous_blockhash = 1;</code>
   * @return The bytes for previousBlockhash.
   */
  com.google.protobuf.ByteString
      getPreviousBlockhashBytes();

  /**
   * <code>string blockhash = 2;</code>
   * @return The blockhash.
   */
  String getBlockhash();
  /**
   * <code>string blockhash = 2;</code>
   * @return The bytes for blockhash.
   */
  com.google.protobuf.ByteString
      getBlockhashBytes();

  /**
   * <code>uint64 parent_slot = 3;</code>
   * @return The parentSlot.
   */
  long getParentSlot();

  /**
   * <code>repeated .solana.storage.ConfirmedBlock.ConfirmedTransaction transactions = 4;</code>
   */
  java.util.List<ConfirmedTransaction>
      getTransactionsList();
  /**
   * <code>repeated .solana.storage.ConfirmedBlock.ConfirmedTransaction transactions = 4;</code>
   */
  ConfirmedTransaction getTransactions(int index);
  /**
   * <code>repeated .solana.storage.ConfirmedBlock.ConfirmedTransaction transactions = 4;</code>
   */
  int getTransactionsCount();
  /**
   * <code>repeated .solana.storage.ConfirmedBlock.ConfirmedTransaction transactions = 4;</code>
   */
  java.util.List<? extends ConfirmedTransactionOrBuilder>
      getTransactionsOrBuilderList();
  /**
   * <code>repeated .solana.storage.ConfirmedBlock.ConfirmedTransaction transactions = 4;</code>
   */
  ConfirmedTransactionOrBuilder getTransactionsOrBuilder(
      int index);

  /**
   * <code>repeated .solana.storage.ConfirmedBlock.Reward rewards = 5;</code>
   */
  java.util.List<Reward>
      getRewardsList();
  /**
   * <code>repeated .solana.storage.ConfirmedBlock.Reward rewards = 5;</code>
   */
  Reward getRewards(int index);
  /**
   * <code>repeated .solana.storage.ConfirmedBlock.Reward rewards = 5;</code>
   */
  int getRewardsCount();
  /**
   * <code>repeated .solana.storage.ConfirmedBlock.Reward rewards = 5;</code>
   */
  java.util.List<? extends RewardOrBuilder>
      getRewardsOrBuilderList();
  /**
   * <code>repeated .solana.storage.ConfirmedBlock.Reward rewards = 5;</code>
   */
  RewardOrBuilder getRewardsOrBuilder(
      int index);

  /**
   * <code>.solana.storage.ConfirmedBlock.UnixTimestamp block_time = 6;</code>
   * @return Whether the blockTime field is set.
   */
  boolean hasBlockTime();
  /**
   * <code>.solana.storage.ConfirmedBlock.UnixTimestamp block_time = 6;</code>
   * @return The blockTime.
   */
  UnixTimestamp getBlockTime();
  /**
   * <code>.solana.storage.ConfirmedBlock.UnixTimestamp block_time = 6;</code>
   */
  UnixTimestampOrBuilder getBlockTimeOrBuilder();

  /**
   * <code>.solana.storage.ConfirmedBlock.BlockHeight block_height = 7;</code>
   * @return Whether the blockHeight field is set.
   */
  boolean hasBlockHeight();
  /**
   * <code>.solana.storage.ConfirmedBlock.BlockHeight block_height = 7;</code>
   * @return The blockHeight.
   */
  BlockHeight getBlockHeight();
  /**
   * <code>.solana.storage.ConfirmedBlock.BlockHeight block_height = 7;</code>
   */
  BlockHeightOrBuilder getBlockHeightOrBuilder();

  /**
   * <code>.solana.storage.ConfirmedBlock.NumPartitions num_partitions = 8;</code>
   * @return Whether the numPartitions field is set.
   */
  boolean hasNumPartitions();
  /**
   * <code>.solana.storage.ConfirmedBlock.NumPartitions num_partitions = 8;</code>
   * @return The numPartitions.
   */
  NumPartitions getNumPartitions();
  /**
   * <code>.solana.storage.ConfirmedBlock.NumPartitions num_partitions = 8;</code>
   */
  NumPartitionsOrBuilder getNumPartitionsOrBuilder();
}