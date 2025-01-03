// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: geyser.proto

package geyser;

public interface SubscribeRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:geyser.SubscribeRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>map&lt;string, .geyser.SubscribeRequestFilterAccounts&gt; accounts = 1;</code>
   */
  int getAccountsCount();
  /**
   * <code>map&lt;string, .geyser.SubscribeRequestFilterAccounts&gt; accounts = 1;</code>
   */
  boolean containsAccounts(
      String key);
  /**
   * Use {@link #getAccountsMap()} instead.
   */
  @Deprecated
  java.util.Map<String, SubscribeRequestFilterAccounts>
  getAccounts();
  /**
   * <code>map&lt;string, .geyser.SubscribeRequestFilterAccounts&gt; accounts = 1;</code>
   */
  java.util.Map<String, SubscribeRequestFilterAccounts>
  getAccountsMap();
  /**
   * <code>map&lt;string, .geyser.SubscribeRequestFilterAccounts&gt; accounts = 1;</code>
   */

  /* nullable */
SubscribeRequestFilterAccounts getAccountsOrDefault(
      String key,
      /* nullable */
SubscribeRequestFilterAccounts defaultValue);
  /**
   * <code>map&lt;string, .geyser.SubscribeRequestFilterAccounts&gt; accounts = 1;</code>
   */

  SubscribeRequestFilterAccounts getAccountsOrThrow(
      String key);

  /**
   * <code>map&lt;string, .geyser.SubscribeRequestFilterSlots&gt; slots = 2;</code>
   */
  int getSlotsCount();
  /**
   * <code>map&lt;string, .geyser.SubscribeRequestFilterSlots&gt; slots = 2;</code>
   */
  boolean containsSlots(
      String key);
  /**
   * Use {@link #getSlotsMap()} instead.
   */
  @Deprecated
  java.util.Map<String, SubscribeRequestFilterSlots>
  getSlots();
  /**
   * <code>map&lt;string, .geyser.SubscribeRequestFilterSlots&gt; slots = 2;</code>
   */
  java.util.Map<String, SubscribeRequestFilterSlots>
  getSlotsMap();
  /**
   * <code>map&lt;string, .geyser.SubscribeRequestFilterSlots&gt; slots = 2;</code>
   */

  /* nullable */
SubscribeRequestFilterSlots getSlotsOrDefault(
      String key,
      /* nullable */
SubscribeRequestFilterSlots defaultValue);
  /**
   * <code>map&lt;string, .geyser.SubscribeRequestFilterSlots&gt; slots = 2;</code>
   */

  SubscribeRequestFilterSlots getSlotsOrThrow(
      String key);

  /**
   * <code>map&lt;string, .geyser.SubscribeRequestFilterTransactions&gt; transactions = 3;</code>
   */
  int getTransactionsCount();
  /**
   * <code>map&lt;string, .geyser.SubscribeRequestFilterTransactions&gt; transactions = 3;</code>
   */
  boolean containsTransactions(
      String key);
  /**
   * Use {@link #getTransactionsMap()} instead.
   */
  @Deprecated
  java.util.Map<String, SubscribeRequestFilterTransactions>
  getTransactions();
  /**
   * <code>map&lt;string, .geyser.SubscribeRequestFilterTransactions&gt; transactions = 3;</code>
   */
  java.util.Map<String, SubscribeRequestFilterTransactions>
  getTransactionsMap();
  /**
   * <code>map&lt;string, .geyser.SubscribeRequestFilterTransactions&gt; transactions = 3;</code>
   */

  /* nullable */
SubscribeRequestFilterTransactions getTransactionsOrDefault(
      String key,
      /* nullable */
SubscribeRequestFilterTransactions defaultValue);
  /**
   * <code>map&lt;string, .geyser.SubscribeRequestFilterTransactions&gt; transactions = 3;</code>
   */

  SubscribeRequestFilterTransactions getTransactionsOrThrow(
      String key);

  /**
   * <code>map&lt;string, .geyser.SubscribeRequestFilterTransactions&gt; transactions_status = 10;</code>
   */
  int getTransactionsStatusCount();
  /**
   * <code>map&lt;string, .geyser.SubscribeRequestFilterTransactions&gt; transactions_status = 10;</code>
   */
  boolean containsTransactionsStatus(
      String key);
  /**
   * Use {@link #getTransactionsStatusMap()} instead.
   */
  @Deprecated
  java.util.Map<String, SubscribeRequestFilterTransactions>
  getTransactionsStatus();
  /**
   * <code>map&lt;string, .geyser.SubscribeRequestFilterTransactions&gt; transactions_status = 10;</code>
   */
  java.util.Map<String, SubscribeRequestFilterTransactions>
  getTransactionsStatusMap();
  /**
   * <code>map&lt;string, .geyser.SubscribeRequestFilterTransactions&gt; transactions_status = 10;</code>
   */

  /* nullable */
SubscribeRequestFilterTransactions getTransactionsStatusOrDefault(
      String key,
      /* nullable */
SubscribeRequestFilterTransactions defaultValue);
  /**
   * <code>map&lt;string, .geyser.SubscribeRequestFilterTransactions&gt; transactions_status = 10;</code>
   */

  SubscribeRequestFilterTransactions getTransactionsStatusOrThrow(
      String key);

  /**
   * <code>map&lt;string, .geyser.SubscribeRequestFilterBlocks&gt; blocks = 4;</code>
   */
  int getBlocksCount();
  /**
   * <code>map&lt;string, .geyser.SubscribeRequestFilterBlocks&gt; blocks = 4;</code>
   */
  boolean containsBlocks(
      String key);
  /**
   * Use {@link #getBlocksMap()} instead.
   */
  @Deprecated
  java.util.Map<String, SubscribeRequestFilterBlocks>
  getBlocks();
  /**
   * <code>map&lt;string, .geyser.SubscribeRequestFilterBlocks&gt; blocks = 4;</code>
   */
  java.util.Map<String, SubscribeRequestFilterBlocks>
  getBlocksMap();
  /**
   * <code>map&lt;string, .geyser.SubscribeRequestFilterBlocks&gt; blocks = 4;</code>
   */

  /* nullable */
SubscribeRequestFilterBlocks getBlocksOrDefault(
      String key,
      /* nullable */
SubscribeRequestFilterBlocks defaultValue);
  /**
   * <code>map&lt;string, .geyser.SubscribeRequestFilterBlocks&gt; blocks = 4;</code>
   */

  SubscribeRequestFilterBlocks getBlocksOrThrow(
      String key);

  /**
   * <code>map&lt;string, .geyser.SubscribeRequestFilterBlocksMeta&gt; blocks_meta = 5;</code>
   */
  int getBlocksMetaCount();
  /**
   * <code>map&lt;string, .geyser.SubscribeRequestFilterBlocksMeta&gt; blocks_meta = 5;</code>
   */
  boolean containsBlocksMeta(
      String key);
  /**
   * Use {@link #getBlocksMetaMap()} instead.
   */
  @Deprecated
  java.util.Map<String, SubscribeRequestFilterBlocksMeta>
  getBlocksMeta();
  /**
   * <code>map&lt;string, .geyser.SubscribeRequestFilterBlocksMeta&gt; blocks_meta = 5;</code>
   */
  java.util.Map<String, SubscribeRequestFilterBlocksMeta>
  getBlocksMetaMap();
  /**
   * <code>map&lt;string, .geyser.SubscribeRequestFilterBlocksMeta&gt; blocks_meta = 5;</code>
   */

  /* nullable */
SubscribeRequestFilterBlocksMeta getBlocksMetaOrDefault(
      String key,
      /* nullable */
SubscribeRequestFilterBlocksMeta defaultValue);
  /**
   * <code>map&lt;string, .geyser.SubscribeRequestFilterBlocksMeta&gt; blocks_meta = 5;</code>
   */

  SubscribeRequestFilterBlocksMeta getBlocksMetaOrThrow(
      String key);

  /**
   * <code>map&lt;string, .geyser.SubscribeRequestFilterEntry&gt; entry = 8;</code>
   */
  int getEntryCount();
  /**
   * <code>map&lt;string, .geyser.SubscribeRequestFilterEntry&gt; entry = 8;</code>
   */
  boolean containsEntry(
      String key);
  /**
   * Use {@link #getEntryMap()} instead.
   */
  @Deprecated
  java.util.Map<String, SubscribeRequestFilterEntry>
  getEntry();
  /**
   * <code>map&lt;string, .geyser.SubscribeRequestFilterEntry&gt; entry = 8;</code>
   */
  java.util.Map<String, SubscribeRequestFilterEntry>
  getEntryMap();
  /**
   * <code>map&lt;string, .geyser.SubscribeRequestFilterEntry&gt; entry = 8;</code>
   */

  /* nullable */
SubscribeRequestFilterEntry getEntryOrDefault(
      String key,
      /* nullable */
SubscribeRequestFilterEntry defaultValue);
  /**
   * <code>map&lt;string, .geyser.SubscribeRequestFilterEntry&gt; entry = 8;</code>
   */

  SubscribeRequestFilterEntry getEntryOrThrow(
      String key);

  /**
   * <code>optional .geyser.CommitmentLevel commitment = 6;</code>
   * @return Whether the commitment field is set.
   */
  boolean hasCommitment();
  /**
   * <code>optional .geyser.CommitmentLevel commitment = 6;</code>
   * @return The enum numeric value on the wire for commitment.
   */
  int getCommitmentValue();
  /**
   * <code>optional .geyser.CommitmentLevel commitment = 6;</code>
   * @return The commitment.
   */
  CommitmentLevel getCommitment();

  /**
   * <code>repeated .geyser.SubscribeRequestAccountsDataSlice accounts_data_slice = 7;</code>
   */
  java.util.List<SubscribeRequestAccountsDataSlice>
      getAccountsDataSliceList();
  /**
   * <code>repeated .geyser.SubscribeRequestAccountsDataSlice accounts_data_slice = 7;</code>
   */
  SubscribeRequestAccountsDataSlice getAccountsDataSlice(int index);
  /**
   * <code>repeated .geyser.SubscribeRequestAccountsDataSlice accounts_data_slice = 7;</code>
   */
  int getAccountsDataSliceCount();
  /**
   * <code>repeated .geyser.SubscribeRequestAccountsDataSlice accounts_data_slice = 7;</code>
   */
  java.util.List<? extends SubscribeRequestAccountsDataSliceOrBuilder>
      getAccountsDataSliceOrBuilderList();
  /**
   * <code>repeated .geyser.SubscribeRequestAccountsDataSlice accounts_data_slice = 7;</code>
   */
  SubscribeRequestAccountsDataSliceOrBuilder getAccountsDataSliceOrBuilder(
      int index);

  /**
   * <code>optional .geyser.SubscribeRequestPing ping = 9;</code>
   * @return Whether the ping field is set.
   */
  boolean hasPing();
  /**
   * <code>optional .geyser.SubscribeRequestPing ping = 9;</code>
   * @return The ping.
   */
  SubscribeRequestPing getPing();
  /**
   * <code>optional .geyser.SubscribeRequestPing ping = 9;</code>
   */
  SubscribeRequestPingOrBuilder getPingOrBuilder();

  /**
   * <code>optional uint64 from_slot = 11;</code>
   * @return Whether the fromSlot field is set.
   */
  boolean hasFromSlot();
  /**
   * <code>optional uint64 from_slot = 11;</code>
   * @return The fromSlot.
   */
  long getFromSlot();
}
